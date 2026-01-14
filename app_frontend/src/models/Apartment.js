export default class Apartment {
  constructor({ apartmentId, name, owner, address, description, city, country, price }) {
    this.apartmentId = apartmentId;
    this.name = name;
    this.owner = owner;
    this.address = address;
    this.description = description;
    this.city = city;
    this.country = country;
    this.price = price;
  }

  displayInfo() {
    return `${this.name} at ${this.address}, ${this.city}, ${this.country} — $${this.price}`;
  }

  ownerName() {
    return this.owner?.username || "Unknown Owner";
  }
}
