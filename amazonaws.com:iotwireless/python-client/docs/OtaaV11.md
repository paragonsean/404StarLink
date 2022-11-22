# OtaaV11

OTAA device object for v1.1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_key** | **str** |  | [optional] 
**nwk_key** | **str** |  | [optional] 
**join_eui** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.otaa_v11 import OtaaV11

# TODO update the JSON string below
json = "{}"
# create an instance of OtaaV11 from a JSON string
otaa_v11_instance = OtaaV11.from_json(json)
# print the JSON string representation of the object
print(OtaaV11.to_json())

# convert the object into a dict
otaa_v11_dict = otaa_v11_instance.to_dict()
# create an instance of OtaaV11 from a dict
otaa_v11_from_dict = OtaaV11.from_dict(otaa_v11_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


