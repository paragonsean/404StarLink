# Licer400Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** |  | [optional] 
**error_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.licer400_response import Licer400Response

# TODO update the JSON string below
json = "{}"
# create an instance of Licer400Response from a JSON string
licer400_response_instance = Licer400Response.from_json(json)
# print the JSON string representation of the object
print(Licer400Response.to_json())

# convert the object into a dict
licer400_response_dict = licer400_response_instance.to_dict()
# create an instance of Licer400Response from a dict
licer400_response_from_dict = Licer400Response.from_dict(licer400_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


