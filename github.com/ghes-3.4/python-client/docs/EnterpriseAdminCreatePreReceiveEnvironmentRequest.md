# EnterpriseAdminCreatePreReceiveEnvironmentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_url** | **str** | URL from which to download a tarball of this environment. | 
**name** | **str** | The new pre-receive environment&#39;s name. | 

## Example

```python
from openapi_client.models.enterprise_admin_create_pre_receive_environment_request import EnterpriseAdminCreatePreReceiveEnvironmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminCreatePreReceiveEnvironmentRequest from a JSON string
enterprise_admin_create_pre_receive_environment_request_instance = EnterpriseAdminCreatePreReceiveEnvironmentRequest.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminCreatePreReceiveEnvironmentRequest.to_json())

# convert the object into a dict
enterprise_admin_create_pre_receive_environment_request_dict = enterprise_admin_create_pre_receive_environment_request_instance.to_dict()
# create an instance of EnterpriseAdminCreatePreReceiveEnvironmentRequest from a dict
enterprise_admin_create_pre_receive_environment_request_from_dict = EnterpriseAdminCreatePreReceiveEnvironmentRequest.from_dict(enterprise_admin_create_pre_receive_environment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


