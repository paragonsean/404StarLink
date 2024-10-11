# Btcer500Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** |  | [optional] 
**error_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.btcer500_response import Btcer500Response

# TODO update the JSON string below
json = "{}"
# create an instance of Btcer500Response from a JSON string
btcer500_response_instance = Btcer500Response.from_json(json)
# print the JSON string representation of the object
print(Btcer500Response.to_json())

# convert the object into a dict
btcer500_response_dict = btcer500_response_instance.to_dict()
# create an instance of Btcer500Response from a dict
btcer500_response_from_dict = Btcer500Response.from_dict(btcer500_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


