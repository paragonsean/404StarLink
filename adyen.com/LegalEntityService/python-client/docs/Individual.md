# Individual


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**birth_data** | [**BirthData**](BirthData.md) | The individual&#39;s birth information. | [optional] 
**email** | **str** | The email address of the legal entity. | [optional] 
**identification_data** | [**IdentificationData**](IdentificationData.md) | Information about the individual&#39;s identification document. | [optional] 
**name** | [**Name**](Name.md) | The individual&#39;s name. | 
**nationality** | **str** | The individual&#39;s nationality. | [optional] 
**phone** | [**PhoneNumber**](PhoneNumber.md) | The phone number of the legal entity. | [optional] 
**residential_address** | [**Address**](Address.md) | The residential address of the individual. | 
**tax_information** | [**List[TaxInformation]**](TaxInformation.md) | The tax information of the individual. | [optional] 
**web_data** | [**WebData**](WebData.md) | The website and app URL of the legal entity. | [optional] 

## Example

```python
from openapi_client.models.individual import Individual

# TODO update the JSON string below
json = "{}"
# create an instance of Individual from a JSON string
individual_instance = Individual.from_json(json)
# print the JSON string representation of the object
print(Individual.to_json())

# convert the object into a dict
individual_dict = individual_instance.to_dict()
# create an instance of Individual from a dict
individual_from_dict = Individual.from_dict(individual_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


