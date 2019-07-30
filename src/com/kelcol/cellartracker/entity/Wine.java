package com.kelcol.cellartracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wine")
public class Wine {

	public Wine() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "bottle_purchase_date")
	private String bottlePurchaseDate;

	@Column(name = "bottle_purchase_location")
	private String bottlePurchaseLocation;

	@Column(name = "bottle_purchase_city")
	private String bottlePurchaseCity;

	@Column(name = "bottle_purchase_state_province")
	private String bottlePurchaseStateProvince;

	@Column(name = "bottle_purchase_price")
	private String bottlePurchasePrice;

	@Column(name = "bottle_open_date")
	private String bottleOpenDate;

	@Column(name = "bottle_size")
	private String bottleSize;

	@Column(name = "bottle_notes")
	private String bottleNotes;

	@Column(name = "wine_producer")
	private String WineProducer;

	@Column(name = "wine_maker")
	private String wineMaker;

	@Column(name = "wine_vintage")
	private String wineVintage;

	@Column(name = "wine_name")
	private String wineName;

	@Column(name = "wine_type")
	private String wineType;

	@Column(name = "wine_designation")
	private String wineDesignation;

	@Column(name = "wine_alcohol")
	private String wineAlcohol;

	@Column(name = "wine_aging_notes")
	private String wineAgingNotes;

	@Column(name = "wine_notes")
	private String wineNotes;

	@Column(name = "varietal_composition")
	private String varietalComposition;

	@Column(name = "varietal_vineyard")
	private String varietalVineyard;

	@Column(name = "varietal_appellation")
	private String varietalAppellation;

	@Column(name = "varietal_subregion")
	private String varietalSubregion;

	@Column(name = "varietal_region")
	private String varietalRegion;

	@Column(name = "varietal_country")
	private String varietalCountry;

	@Column(name = "varietal_notes")
	private String varietalNotes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBottlePurchaseDate() {
		return bottlePurchaseDate;
	}

	public void setBottlePurchaseDate(String bottlePurchaseDate) {
		this.bottlePurchaseDate = bottlePurchaseDate;
	}

	public String getBottlePurchaseLocation() {
		return bottlePurchaseLocation;
	}

	public void setBottlePurchaseLocation(String bottlePurchaseLocation) {
		this.bottlePurchaseLocation = bottlePurchaseLocation;
	}

	public String getBottlePurchaseCity() {
		return bottlePurchaseCity;
	}

	public void setBottlePurchaseCity(String bottlePurchaseCity) {
		this.bottlePurchaseCity = bottlePurchaseCity;
	}

	public String getBottlePurchaseStateProvince() {
		return bottlePurchaseStateProvince;
	}

	public void setBottlePurchaseStateProvince(String bottlePurchaseStateProvince) {
		this.bottlePurchaseStateProvince = bottlePurchaseStateProvince;
	}

	public String getBottlePurchasePrice() {
		return bottlePurchasePrice;
	}

	public void setBottlePurchasePrice(String bottlePurchasePrice) {
		this.bottlePurchasePrice = bottlePurchasePrice;
	}

	public String getBottleOpenDate() {
		return bottleOpenDate;
	}

	public void setBottleOpenDate(String bottleOpenDate) {
		this.bottleOpenDate = bottleOpenDate;
	}

	public String getBottleSize() {
		return bottleSize;
	}

	public void setBottleSize(String bottleSize) {
		this.bottleSize = bottleSize;
	}

	public String getBottleNotes() {
		return bottleNotes;
	}

	public void setBottleNotes(String bottleNotes) {
		this.bottleNotes = bottleNotes;
	}

	public String getWineProducer() {
		return WineProducer;
	}

	public void setWineProducer(String wineProducer) {
		WineProducer = wineProducer;
	}

	public String getWineMaker() {
		return wineMaker;
	}

	public void setWineMaker(String wineMaker) {
		this.wineMaker = wineMaker;
	}

	public String getWineVintage() {
		return wineVintage;
	}

	public void setWineVintage(String wineVintage) {
		this.wineVintage = wineVintage;
	}

	public String getWineName() {
		return wineName;
	}

	public void setWineName(String wineName) {
		this.wineName = wineName;
	}

	public String getWineType() {
		return wineType;
	}

	public void setWineType(String wineType) {
		this.wineType = wineType;
	}

	public String getWineDesignation() {
		return wineDesignation;
	}

	public void setWineDesignation(String wineDesignation) {
		this.wineDesignation = wineDesignation;
	}

	public String getWineAlcohol() {
		return wineAlcohol;
	}

	public void setWineAlcohol(String wineAlcohol) {
		this.wineAlcohol = wineAlcohol;
	}

	public String getWineAgingNotes() {
		return wineAgingNotes;
	}

	public void setWineAgingNotes(String wineAgingNotes) {
		this.wineAgingNotes = wineAgingNotes;
	}

	public String getWineNotes() {
		return wineNotes;
	}

	public void setWineNotes(String wineNotes) {
		this.wineNotes = wineNotes;
	}

	public String getVarietalComposition() {
		return varietalComposition;
	}

	public void setVarietalComposition(String varietalComposition) {
		this.varietalComposition = varietalComposition;
	}

	public String getVarietalVineyard() {
		return varietalVineyard;
	}

	public void setVarietalVineyard(String varietalVineyard) {
		this.varietalVineyard = varietalVineyard;
	}

	public String getVarietalAppellation() {
		return varietalAppellation;
	}

	public void setVarietalAppellation(String varietalAppellation) {
		this.varietalAppellation = varietalAppellation;
	}

	public String getVarietalSubregion() {
		return varietalSubregion;
	}

	public void setVarietalSubregion(String varietalSubregion) {
		this.varietalSubregion = varietalSubregion;
	}

	public String getVarietalRegion() {
		return varietalRegion;
	}

	public void setVarietalRegion(String varietalRegion) {
		this.varietalRegion = varietalRegion;
	}

	public String getVarietalCountry() {
		return varietalCountry;
	}

	public void setVarietalCountry(String varietalCountry) {
		this.varietalCountry = varietalCountry;
	}

	public String getVarietalNotes() {
		return varietalNotes;
	}

	public void setVarietalNotes(String varietalNotes) {
		this.varietalNotes = varietalNotes;
	}

	@Override
	public String toString() {
		return "Wine [id=" + id;
	}

}
