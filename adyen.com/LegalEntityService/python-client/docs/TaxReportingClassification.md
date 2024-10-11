# TaxReportingClassification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_type** | **str** | The organization&#39;s business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**. | [optional] 
**financial_institution_number** | **str** | The Global Intermediary Identification Number (GIIN) required for FATCA. | [optional] 
**main_source_of_income** | **str** | The organization&#39;s main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**. | [optional] 
**type** | **str** | The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**. | [optional] 

## Example

```python
from openapi_client.models.tax_reporting_classification import TaxReportingClassification

# TODO update the JSON string below
json = "{}"
# create an instance of TaxReportingClassification from a JSON string
tax_reporting_classification_instance = TaxReportingClassification.from_json(json)
# print the JSON string representation of the object
print(TaxReportingClassification.to_json())

# convert the object into a dict
tax_reporting_classification_dict = tax_reporting_classification_instance.to_dict()
# create an instance of TaxReportingClassification from a dict
tax_reporting_classification_from_dict = TaxReportingClassification.from_dict(tax_reporting_classification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


