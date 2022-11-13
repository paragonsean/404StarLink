# PutindicesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | **str** | Comma-separted fields of the index | 
**multiple** | **bool** | Determines whether the values need to be unique. If false, values must be unique. | 
**name** | **str** | Name to identify the index | 

## Example

```python
from openapi_client.models.putindices_request import PutindicesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutindicesRequest from a JSON string
putindices_request_instance = PutindicesRequest.from_json(json)
# print the JSON string representation of the object
print(PutindicesRequest.to_json())

# convert the object into a dict
putindices_request_dict = putindices_request_instance.to_dict()
# create an instance of PutindicesRequest from a dict
putindices_request_from_dict = PutindicesRequest.from_dict(putindices_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


