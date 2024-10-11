# Organization


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_of_incorporation** | **str** | The date when the organization was incorporated in YYYY-MM-DD format. | [optional] 
**description** | **str** | Your description for the organization. | [optional] 
**doing_business_as** | **str** | The organization&#39;s trading name, if different from the registered legal name. | [optional] 
**email** | **str** | The email address of the legal entity. | [optional] 
**legal_name** | **str** | The organization&#39;s legal name. | 
**phone** | [**PhoneNumber**](PhoneNumber.md) | The phone number of the legal entity. | [optional] 
**principal_place_of_business** | [**Address**](Address.md) | The address where the organization operates from. Provide this if the principal place of business is different from the &#x60;registeredAddress&#x60;. | [optional] 
**registered_address** | [**Address**](Address.md) | The address of the organization registered at their registrar (such as the Chamber of Commerce). | 
**registration_number** | **str** | The organization&#39;s registration number. | [optional] 
**stock_data** | [**StockData**](StockData.md) | Information about the organization&#39;s publicly traded stock. Provide this object only if &#x60;type&#x60; is **listedPublicCompany**. | [optional] 
**tax_information** | [**List[TaxInformation]**](TaxInformation.md) | The tax information of the organization. | [optional] 
**tax_reporting_classification** | [**TaxReportingClassification**](TaxReportingClassification.md) | The tax reporting classification (FATCA/CRS self-certification) of the organization. | [optional] 
**type** | **str** | Type of organization.   Possible values: **associationIncorporated**, **governmentalOrganization**, **listedPublicCompany**, **nonProfit**, **partnershipIncorporated**, **privateCompany**. | [optional] 
**vat_absence_reason** | **str** | The reason the organization has not provided a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**. | [optional] 
**vat_number** | **str** | The organization&#39;s VAT number. | [optional] 
**web_data** | [**WebData**](WebData.md) | The website and app URL of the legal entity. | [optional] 

## Example

```python
from openapi_client.models.organization import Organization

# TODO update the JSON string below
json = "{}"
# create an instance of Organization from a JSON string
organization_instance = Organization.from_json(json)
# print the JSON string representation of the object
print(Organization.to_json())

# convert the object into a dict
organization_dict = organization_instance.to_dict()
# create an instance of Organization from a dict
organization_from_dict = Organization.from_dict(organization_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


