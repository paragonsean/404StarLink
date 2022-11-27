# EndpointUser

Specifies data for one or more attributes that describe the user who's associated with an endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_attributes** | **Dict** |  | [optional] 
**user_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_user import EndpointUser

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointUser from a JSON string
endpoint_user_instance = EndpointUser.from_json(json)
# print the JSON string representation of the object
print(EndpointUser.to_json())

# convert the object into a dict
endpoint_user_dict = endpoint_user_instance.to_dict()
# create an instance of EndpointUser from a dict
endpoint_user_from_dict = EndpointUser.from_dict(endpoint_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


