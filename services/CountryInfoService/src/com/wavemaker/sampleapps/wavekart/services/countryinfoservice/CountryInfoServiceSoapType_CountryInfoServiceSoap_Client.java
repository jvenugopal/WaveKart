/*Copyright (c) 2015-2016 WaveMaker.com All Rights Reserved.
 This software is the confidential and proprietary information of WaveMaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with WaveMaker.com*/


package com.wavemaker.sampleapps.wavekart.services.countryinfoservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-07-15T10:02:38.095Z
 * Generated source version: 2.7.11
 * 
 */
public final class CountryInfoServiceSoapType_CountryInfoServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");

    private CountryInfoServiceSoapType_CountryInfoServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CountryInfoService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CountryInfoService ss = new CountryInfoService(wsdlURL, SERVICE_NAME);
        CountryInfoServiceSoapType port = ss.getCountryInfoServiceSoap();  
        
        {
        System.out.println("Invoking listOfCountryNamesGroupedByContinent...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCountryNamesGroupedByContinent _listOfCountryNamesGroupedByContinent_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCountryNamesGroupedByContinentResponse _listOfCountryNamesGroupedByContinent__return = port.listOfCountryNamesGroupedByContinent(_listOfCountryNamesGroupedByContinent_parameters);
        System.out.println("listOfCountryNamesGroupedByContinent.result=" + _listOfCountryNamesGroupedByContinent__return);


        }
        {
        System.out.println("Invoking countryFlag...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryFlag _countryFlag_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryFlagResponse _countryFlag__return = port.countryFlag(_countryFlag_parameters);
        System.out.println("countryFlag.result=" + _countryFlag__return);


        }
        {
        System.out.println("Invoking listOfCountryNamesByName...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCountryNamesByName _listOfCountryNamesByName_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCountryNamesByNameResponse _listOfCountryNamesByName__return = port.listOfCountryNamesByName(_listOfCountryNamesByName_parameters);
        System.out.println("listOfCountryNamesByName.result=" + _listOfCountryNamesByName__return);


        }
        {
        System.out.println("Invoking countryName...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryName _countryName_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryNameResponse _countryName__return = port.countryName(_countryName_parameters);
        System.out.println("countryName.result=" + _countryName__return);


        }
        {
        System.out.println("Invoking languageISOCode...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.LanguageISOCode _languageISOCode_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.LanguageISOCodeResponse _languageISOCode__return = port.languageISOCode(_languageISOCode_parameters);
        System.out.println("languageISOCode.result=" + _languageISOCode__return);


        }
        {
        System.out.println("Invoking countryCurrency...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryCurrency _countryCurrency_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryCurrencyResponse _countryCurrency__return = port.countryCurrency(_countryCurrency_parameters);
        System.out.println("countryCurrency.result=" + _countryCurrency__return);


        }
        {
        System.out.println("Invoking currencyName...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CurrencyName _currencyName_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CurrencyNameResponse _currencyName__return = port.currencyName(_currencyName_parameters);
        System.out.println("currencyName.result=" + _currencyName__return);


        }
        {
        System.out.println("Invoking listOfLanguagesByName...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfLanguagesByName _listOfLanguagesByName_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfLanguagesByNameResponse _listOfLanguagesByName__return = port.listOfLanguagesByName(_listOfLanguagesByName_parameters);
        System.out.println("listOfLanguagesByName.result=" + _listOfLanguagesByName__return);


        }
        {
        System.out.println("Invoking fullCountryInfoAllCountries...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.FullCountryInfoAllCountries _fullCountryInfoAllCountries_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.FullCountryInfoAllCountriesResponse _fullCountryInfoAllCountries__return = port.fullCountryInfoAllCountries(_fullCountryInfoAllCountries_parameters);
        System.out.println("fullCountryInfoAllCountries.result=" + _fullCountryInfoAllCountries__return);


        }
        {
        System.out.println("Invoking listOfCountryNamesByCode...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCountryNamesByCode _listOfCountryNamesByCode_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCountryNamesByCodeResponse _listOfCountryNamesByCode__return = port.listOfCountryNamesByCode(_listOfCountryNamesByCode_parameters);
        System.out.println("listOfCountryNamesByCode.result=" + _listOfCountryNamesByCode__return);


        }
        {
        System.out.println("Invoking listOfCurrenciesByName...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCurrenciesByName _listOfCurrenciesByName_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCurrenciesByNameResponse _listOfCurrenciesByName__return = port.listOfCurrenciesByName(_listOfCurrenciesByName_parameters);
        System.out.println("listOfCurrenciesByName.result=" + _listOfCurrenciesByName__return);


        }
        {
        System.out.println("Invoking fullCountryInfo...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.FullCountryInfo _fullCountryInfo_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.FullCountryInfoResponse _fullCountryInfo__return = port.fullCountryInfo(_fullCountryInfo_parameters);
        System.out.println("fullCountryInfo.result=" + _fullCountryInfo__return);


        }
        {
        System.out.println("Invoking listOfContinentsByCode...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfContinentsByCode _listOfContinentsByCode_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfContinentsByCodeResponse _listOfContinentsByCode__return = port.listOfContinentsByCode(_listOfContinentsByCode_parameters);
        System.out.println("listOfContinentsByCode.result=" + _listOfContinentsByCode__return);


        }
        {
        System.out.println("Invoking listOfCurrenciesByCode...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCurrenciesByCode _listOfCurrenciesByCode_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfCurrenciesByCodeResponse _listOfCurrenciesByCode__return = port.listOfCurrenciesByCode(_listOfCurrenciesByCode_parameters);
        System.out.println("listOfCurrenciesByCode.result=" + _listOfCurrenciesByCode__return);


        }
        {
        System.out.println("Invoking languageName...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.LanguageName _languageName_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.LanguageNameResponse _languageName__return = port.languageName(_languageName_parameters);
        System.out.println("languageName.result=" + _languageName__return);


        }
        {
        System.out.println("Invoking countryISOCode...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryISOCode _countryISOCode_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryISOCodeResponse _countryISOCode__return = port.countryISOCode(_countryISOCode_parameters);
        System.out.println("countryISOCode.result=" + _countryISOCode__return);


        }
        {
        System.out.println("Invoking listOfContinentsByName...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfContinentsByName _listOfContinentsByName_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfContinentsByNameResponse _listOfContinentsByName__return = port.listOfContinentsByName(_listOfContinentsByName_parameters);
        System.out.println("listOfContinentsByName.result=" + _listOfContinentsByName__return);


        }
        {
        System.out.println("Invoking countryIntPhoneCode...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryIntPhoneCode _countryIntPhoneCode_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountryIntPhoneCodeResponse _countryIntPhoneCode__return = port.countryIntPhoneCode(_countryIntPhoneCode_parameters);
        System.out.println("countryIntPhoneCode.result=" + _countryIntPhoneCode__return);


        }
        {
        System.out.println("Invoking listOfLanguagesByCode...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfLanguagesByCode _listOfLanguagesByCode_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.ListOfLanguagesByCodeResponse _listOfLanguagesByCode__return = port.listOfLanguagesByCode(_listOfLanguagesByCode_parameters);
        System.out.println("listOfLanguagesByCode.result=" + _listOfLanguagesByCode__return);


        }
        {
        System.out.println("Invoking countriesUsingCurrency...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountriesUsingCurrency _countriesUsingCurrency_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CountriesUsingCurrencyResponse _countriesUsingCurrency__return = port.countriesUsingCurrency(_countriesUsingCurrency_parameters);
        System.out.println("countriesUsingCurrency.result=" + _countriesUsingCurrency__return);


        }
        {
        System.out.println("Invoking capitalCity...");
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CapitalCity _capitalCity_parameters = null;
        com.wavemaker.sampleapps.wavekart.services.countryinfoservice.CapitalCityResponse _capitalCity__return = port.capitalCity(_capitalCity_parameters);
        System.out.println("capitalCity.result=" + _capitalCity__return);


        }

        System.exit(0);
    }

}
