# EndpointResponseUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_attributes** | **Dict** |  | [optional] 
**user_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_response_user import EndpointResponseUser

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointResponseUser from a JSON string
endpoint_response_user_instance = EndpointResponseUser.from_json(json)
# print the JSON string representation of the object
print(EndpointResponseUser.to_json())

# convert the object into a dict
endpoint_response_user_dict = endpoint_response_user_instance.to_dict()
# create an instance of EndpointResponseUser from a dict
endpoint_response_user_from_dict = EndpointResponseUser.from_dict(endpoint_response_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


