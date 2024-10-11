# BusinessLine


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capability** | **str** | The capability for which you are creating the business line. For example, **receivePayments**. | [optional] 
**id** | **str** | The unique identifier of the business line. | [readonly] 
**industry_code** | **str** | A code that represents the industry of the legal entity. For example, **4431A** for computer software stores. | 
**legal_entity_id** | **str** | Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line. | 
**problems** | [**List[CapabilityProblem]**](CapabilityProblem.md) | List of the verification errors from capabilities for this supporting entity. | [optional] 
**sales_channels** | **List[str]** | A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**. | [optional] 
**service** | **str** | The service for which you are creating the business line.  Possible values:**paymentProcessing**, **issuing**, **banking** | 
**source_of_funds** | [**SourceOfFunds**](SourceOfFunds.md) | Contains information about the source of your user&#39;s funds. Required only for the &#x60;service&#x60; **banking**. | [optional] 
**web_data** | [**List[WebData]**](WebData.md) | List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object. | [optional] 
**web_data_exemption** | [**WebDataExemption**](WebDataExemption.md) | The reason why the web data is not provided. | [optional] 

## Example

```python
from openapi_client.models.business_line import BusinessLine

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessLine from a JSON string
business_line_instance = BusinessLine.from_json(json)
# print the JSON string representation of the object
print(BusinessLine.to_json())

# convert the object into a dict
business_line_dict = business_line_instance.to_dict()
# create an instance of BusinessLine from a dict
business_line_from_dict = BusinessLine.from_dict(business_line_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


