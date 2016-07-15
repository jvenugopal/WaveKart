/*Copyright (c) 2015-2016 WaveMaker.com All Rights Reserved.
 This software is the confidential and proprietary information of WaveMaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with WaveMaker.com*/

package com.wavemaker.sampleapps.wavekart.services.countryinfoservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-07-15T10:02:38.134Z
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", name = "CountryInfoServiceSoapType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CountryInfoServiceSoapType {

    /**
     * Returns a list of all stored counties grouped per continent
     */
    @WebResult(name = "ListOfCountryNamesGroupedByContinentResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfCountryNamesGroupedByContinent")
    public ListOfCountryNamesGroupedByContinentResponse listOfCountryNamesGroupedByContinent(
        @WebParam(partName = "parameters", name = "ListOfCountryNamesGroupedByContinent", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfCountryNamesGroupedByContinent parameters
    );

    /**
     * Returns a link to a picture of the country flag
     */
    @WebResult(name = "CountryFlagResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CountryFlag")
    public CountryFlagResponse countryFlag(
        @WebParam(partName = "parameters", name = "CountryFlag", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CountryFlag parameters
    );

    /**
     * Returns a list of all stored counties ordered by country name
     */
    @WebResult(name = "ListOfCountryNamesByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfCountryNamesByName")
    public ListOfCountryNamesByNameResponse listOfCountryNamesByName(
        @WebParam(partName = "parameters", name = "ListOfCountryNamesByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfCountryNamesByName parameters
    );

    /**
     * Searches the database for a country by the passed ISO country code
     */
    @WebResult(name = "CountryNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CountryName")
    public CountryNameResponse countryName(
        @WebParam(partName = "parameters", name = "CountryName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CountryName parameters
    );

    /**
     * Find a language ISO code based on the passed language name
     */
    @WebResult(name = "LanguageISOCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "LanguageISOCode")
    public LanguageISOCodeResponse languageISOCode(
        @WebParam(partName = "parameters", name = "LanguageISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        LanguageISOCode parameters
    );

    /**
     * Returns the currency ISO code and name for the passed country ISO code
     */
    @WebResult(name = "CountryCurrencyResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CountryCurrency")
    public CountryCurrencyResponse countryCurrency(
        @WebParam(partName = "parameters", name = "CountryCurrency", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CountryCurrency parameters
    );

    /**
     * Returns the name of the currency (if found)
     */
    @WebResult(name = "CurrencyNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CurrencyName")
    public CurrencyNameResponse currencyName(
        @WebParam(partName = "parameters", name = "CurrencyName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CurrencyName parameters
    );

    /**
     * Returns an array of languages ordered by name
     */
    @WebResult(name = "ListOfLanguagesByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfLanguagesByName")
    public ListOfLanguagesByNameResponse listOfLanguagesByName(
        @WebParam(partName = "parameters", name = "ListOfLanguagesByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfLanguagesByName parameters
    );

    /**
     * Returns an array with all countries and all the language information stored
     */
    @WebResult(name = "FullCountryInfoAllCountriesResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "FullCountryInfoAllCountries")
    public FullCountryInfoAllCountriesResponse fullCountryInfoAllCountries(
        @WebParam(partName = "parameters", name = "FullCountryInfoAllCountries", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        FullCountryInfoAllCountries parameters
    );

    /**
     * Returns a list of all stored counties ordered by ISO code
     */
    @WebResult(name = "ListOfCountryNamesByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfCountryNamesByCode")
    public ListOfCountryNamesByCodeResponse listOfCountryNamesByCode(
        @WebParam(partName = "parameters", name = "ListOfCountryNamesByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfCountryNamesByCode parameters
    );

    /**
     * Returns a list of currencies ordered by name.
     */
    @WebResult(name = "ListOfCurrenciesByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfCurrenciesByName")
    public ListOfCurrenciesByNameResponse listOfCurrenciesByName(
        @WebParam(partName = "parameters", name = "ListOfCurrenciesByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfCurrenciesByName parameters
    );

    /**
     * Returns a struct with all the stored country information. Pass the ISO country code
     */
    @WebResult(name = "FullCountryInfoResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "FullCountryInfo")
    public FullCountryInfoResponse fullCountryInfo(
        @WebParam(partName = "parameters", name = "FullCountryInfo", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        FullCountryInfo parameters
    );

    /**
     * Returns a list of continents ordered by code.
     */
    @WebResult(name = "ListOfContinentsByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfContinentsByCode")
    public ListOfContinentsByCodeResponse listOfContinentsByCode(
        @WebParam(partName = "parameters", name = "ListOfContinentsByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfContinentsByCode parameters
    );

    /**
     * Returns a list of currencies ordered by code.
     */
    @WebResult(name = "ListOfCurrenciesByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfCurrenciesByCode")
    public ListOfCurrenciesByCodeResponse listOfCurrenciesByCode(
        @WebParam(partName = "parameters", name = "ListOfCurrenciesByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfCurrenciesByCode parameters
    );

    /**
     * Find a language name based on the passed ISO language code
     */
    @WebResult(name = "LanguageNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "LanguageName")
    public LanguageNameResponse languageName(
        @WebParam(partName = "parameters", name = "LanguageName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        LanguageName parameters
    );

    /**
     * This function tries to found a country based on the passed country name.
     */
    @WebResult(name = "CountryISOCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CountryISOCode")
    public CountryISOCodeResponse countryISOCode(
        @WebParam(partName = "parameters", name = "CountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CountryISOCode parameters
    );

    /**
     * Returns a list of continents ordered by name.
     */
    @WebResult(name = "ListOfContinentsByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfContinentsByName")
    public ListOfContinentsByNameResponse listOfContinentsByName(
        @WebParam(partName = "parameters", name = "ListOfContinentsByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfContinentsByName parameters
    );

    /**
     * Returns the internation phone code for the passed ISO country code
     */
    @WebResult(name = "CountryIntPhoneCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CountryIntPhoneCode")
    public CountryIntPhoneCodeResponse countryIntPhoneCode(
        @WebParam(partName = "parameters", name = "CountryIntPhoneCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CountryIntPhoneCode parameters
    );

    /**
     * Returns an array of languages ordered by code
     */
    @WebResult(name = "ListOfLanguagesByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "ListOfLanguagesByCode")
    public ListOfLanguagesByCodeResponse listOfLanguagesByCode(
        @WebParam(partName = "parameters", name = "ListOfLanguagesByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        ListOfLanguagesByCode parameters
    );

    /**
     * Returns a list of all countries that use the same currency code. Pass a ISO currency code
     */
    @WebResult(name = "CountriesUsingCurrencyResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CountriesUsingCurrency")
    public CountriesUsingCurrencyResponse countriesUsingCurrency(
        @WebParam(partName = "parameters", name = "CountriesUsingCurrency", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CountriesUsingCurrency parameters
    );

    /**
     * Returns the  name of the captial city for the passed country code
     */
    @WebResult(name = "CapitalCityResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", partName = "parameters")
    @WebMethod(operationName = "CapitalCity")
    public CapitalCityResponse capitalCity(
        @WebParam(partName = "parameters", name = "CapitalCity", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        CapitalCity parameters
    );
}
