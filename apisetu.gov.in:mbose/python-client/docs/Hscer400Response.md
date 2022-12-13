# Hscer400Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** |  | [optional] 
**error_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.hscer400_response import Hscer400Response

# TODO update the JSON string below
json = "{}"
# create an instance of Hscer400Response from a JSON string
hscer400_response_instance = Hscer400Response.from_json(json)
# print the JSON string representation of the object
print(Hscer400Response.to_json())

# convert the object into a dict
hscer400_response_dict = hscer400_response_instance.to_dict()
# create an instance of Hscer400Response from a dict
hscer400_response_from_dict = Hscer400Response.from_dict(hscer400_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


