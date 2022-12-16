# Licer500Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **str** |  | [optional] 
**error_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.licer500_response import Licer500Response

# TODO update the JSON string below
json = "{}"
# create an instance of Licer500Response from a JSON string
licer500_response_instance = Licer500Response.from_json(json)
# print the JSON string representation of the object
print(Licer500Response.to_json())

# convert the object into a dict
licer500_response_dict = licer500_response_instance.to_dict()
# create an instance of Licer500Response from a dict
licer500_response_from_dict = Licer500Response.from_dict(licer500_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


