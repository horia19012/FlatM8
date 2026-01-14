export const getAllApartments = async () => {
    try {
        const response = await fetch('http://localhost:8080/apartments', {
            methos: 'GET',
            headers: { 'Content-Type': 'application/json' },
        });

        const data = await response.json();
        return data;
    } catch (error) {
        throw error;
    };
};

export const getApartmentById = async (apartmentId) => {
    try {
        const response = await fetch(`http://localhost:8080/apartments/${apartmentId}`, {
            methos: 'GET',
            headers: { 'Content-Type': 'application/json' },
        });

        const data = await response.json();
        return data;
    } catch (error) {
        throw error;
    }
}

export const createApartment = async (apartmentData) => {
    try {
        const response = await fetch('http://localhost:8080/apartments', {
            methos: 'GET',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(apartmentData)
        });

        const data = await response.json();
        return data;
    } catch (error) {
        throw error;
    }
}


