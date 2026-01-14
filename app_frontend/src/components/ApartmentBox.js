function ApartmentBox({ apartment }) {
    return (
        <div className="apartment-box">
            <h2>{apartment.name}</h2>
            <p><strong>Address:</strong> {apartment.address}</p>
            <p><strong>Owner:</strong> {apartment.owner ? apartment.ownerName() : apartment.owner?.username || "Unknown"}</p>
            <p><strong>Description:</strong> {apartment.description}</p>

        </div>
    )
}
export default ApartmentBox;