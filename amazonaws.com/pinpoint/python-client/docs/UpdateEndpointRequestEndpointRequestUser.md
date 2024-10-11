# UpdateEndpointRequestEndpointRequestUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_attributes** | **Dict** |  | [optional] 
**user_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_endpoint_request_endpoint_request_user import UpdateEndpointRequestEndpointRequestUser

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointRequestEndpointRequestUser from a JSON string
update_endpoint_request_endpoint_request_user_instance = UpdateEndpointRequestEndpointRequestUser.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointRequestEndpointRequestUser.to_json())

# convert the object into a dict
update_endpoint_request_endpoint_request_user_dict = update_endpoint_request_endpoint_request_user_instance.to_dict()
# create an instance of UpdateEndpointRequestEndpointRequestUser from a dict
update_endpoint_request_endpoint_request_user_from_dict = UpdateEndpointRequestEndpointRequestUser.from_dict(update_endpoint_request_endpoint_request_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


