import { useEffect, useState } from "react";
import ApartmentBox from "./components/ApartmentBox";
import { getAllApartments } from "./services/apartmentService";
import Apartment from "../src/models/Apartment"

function Apartments() {
    const [apartmentList, setApartments] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    useEffect(() => {
        const loadApartments = async () => {
            try {
                const data = await getAllApartments();
                const models = data.map(item => new Apartment(item));
                setApartments(models);
            } catch (error) {
                setError(error.message)
            } finally {
                setLoading(false);
            }
        }

        loadApartments();
    }, [])
    if (loading) return <h2>Loading apartments...</h2>;
    if (error) return <p style={{ color: "red" }}> Error: {error}</p>;

    return (
        <div>
            {apartmentList.map(a => (
                <ApartmentBox key={a.apartmentId} apartment={a} />
            ))}
        </div>

    )
}

export default Apartments;