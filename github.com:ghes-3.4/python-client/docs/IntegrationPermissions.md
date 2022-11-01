# IntegrationPermissions

The set of permissions for the GitHub app

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checks** | **str** |  | [optional] 
**contents** | **str** |  | [optional] 
**deployments** | **str** |  | [optional] 
**issues** | **str** |  | [optional] 
**metadata** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.integration_permissions import IntegrationPermissions

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationPermissions from a JSON string
integration_permissions_instance = IntegrationPermissions.from_json(json)
# print the JSON string representation of the object
print(IntegrationPermissions.to_json())

# convert the object into a dict
integration_permissions_dict = integration_permissions_instance.to_dict()
# create an instance of IntegrationPermissions from a dict
integration_permissions_from_dict = IntegrationPermissions.from_dict(integration_permissions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


