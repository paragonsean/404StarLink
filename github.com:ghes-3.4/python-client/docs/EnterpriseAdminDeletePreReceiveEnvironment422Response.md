# EnterpriseAdminDeletePreReceiveEnvironment422Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[EnterpriseAdminDeletePreReceiveEnvironment422ResponseErrorsInner]**](EnterpriseAdminDeletePreReceiveEnvironment422ResponseErrorsInner.md) |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.enterprise_admin_delete_pre_receive_environment422_response import EnterpriseAdminDeletePreReceiveEnvironment422Response

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminDeletePreReceiveEnvironment422Response from a JSON string
enterprise_admin_delete_pre_receive_environment422_response_instance = EnterpriseAdminDeletePreReceiveEnvironment422Response.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminDeletePreReceiveEnvironment422Response.to_json())

# convert the object into a dict
enterprise_admin_delete_pre_receive_environment422_response_dict = enterprise_admin_delete_pre_receive_environment422_response_instance.to_dict()
# create an instance of EnterpriseAdminDeletePreReceiveEnvironment422Response from a dict
enterprise_admin_delete_pre_receive_environment422_response_from_dict = EnterpriseAdminDeletePreReceiveEnvironment422Response.from_dict(enterprise_admin_delete_pre_receive_environment422_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


