# Btcer400Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** |  | [optional] 
**error_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.btcer400_response import Btcer400Response

# TODO update the JSON string below
json = "{}"
# create an instance of Btcer400Response from a JSON string
btcer400_response_instance = Btcer400Response.from_json(json)
# print the JSON string representation of the object
print(Btcer400Response.to_json())

# convert the object into a dict
btcer400_response_dict = btcer400_response_instance.to_dict()
# create an instance of Btcer400Response from a dict
btcer400_response_from_dict = Btcer400Response.from_dict(btcer400_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


