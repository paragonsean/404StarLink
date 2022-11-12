# Address


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** | The name of the city. Required if &#x60;stateOrProvince&#x60; is provided.  If you specify the city, you must also send &#x60;postalCode&#x60; and &#x60;street&#x60;. | [optional] 
**country** | **str** | The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code. | 
**postal_code** | **str** | Postal code. Required if &#x60;stateOrProvince&#x60; and/or &#x60;city&#x60; is provided. | [optional] 
**state_or_province** | **str** | The two-letter ISO 3166-2 state or province code. For example, **CA** in the US.   If you specify the state or province, you must also send &#x60;city&#x60;, &#x60;postalCode&#x60;, and &#x60;street&#x60;. | [optional] 
**street** | **str** | The name of the street, and the house or building number. Required if &#x60;stateOrProvince&#x60; and/or &#x60;city&#x60; is provided. | [optional] 
**street2** | **str** | The apartment, unit, or suite number. | [optional] 

## Example

```python
from openapi_client.models.address import Address

# TODO update the JSON string below
json = "{}"
# create an instance of Address from a JSON string
address_instance = Address.from_json(json)
# print the JSON string representation of the object
print(Address.to_json())

# convert the object into a dict
address_dict = address_instance.to_dict()
# create an instance of Address from a dict
address_from_dict = Address.from_dict(address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


