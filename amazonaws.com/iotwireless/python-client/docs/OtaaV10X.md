# OtaaV10X

OTAA device object for v1.0.x

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_key** | **str** |  | [optional] 
**app_eui** | **str** |  | [optional] 
**gen_app_key** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.otaa_v10_x import OtaaV10X

# TODO update the JSON string below
json = "{}"
# create an instance of OtaaV10X from a JSON string
otaa_v10_x_instance = OtaaV10X.from_json(json)
# print the JSON string representation of the object
print(OtaaV10X.to_json())

# convert the object into a dict
otaa_v10_x_dict = otaa_v10_x_instance.to_dict()
# create an instance of OtaaV10X from a dict
otaa_v10_x_from_dict = OtaaV10X.from_dict(otaa_v10_x_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


