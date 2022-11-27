# EndpointsResponse

Provides information about all the endpoints that are associated with a user ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 

## Example

```python
from openapi_client.models.endpoints_response import EndpointsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointsResponse from a JSON string
endpoints_response_instance = EndpointsResponse.from_json(json)
# print the JSON string representation of the object
print(EndpointsResponse.to_json())

# convert the object into a dict
endpoints_response_dict = endpoints_response_instance.to_dict()
# create an instance of EndpointsResponse from a dict
endpoints_response_from_dict = EndpointsResponse.from_dict(endpoints_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


