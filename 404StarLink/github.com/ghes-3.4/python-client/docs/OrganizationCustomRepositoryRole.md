# OrganizationCustomRepositoryRole

Custom repository roles created by organization administrators

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The unique identifier of the custom role. | 
**name** | **str** | The name of the custom role. | 

## Example

```python
from openapi_client.models.organization_custom_repository_role import OrganizationCustomRepositoryRole

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationCustomRepositoryRole from a JSON string
organization_custom_repository_role_instance = OrganizationCustomRepositoryRole.from_json(json)
# print the JSON string representation of the object
print(OrganizationCustomRepositoryRole.to_json())

# convert the object into a dict
organization_custom_repository_role_dict = organization_custom_repository_role_instance.to_dict()
# create an instance of OrganizationCustomRepositoryRole from a dict
organization_custom_repository_role_from_dict = OrganizationCustomRepositoryRole.from_dict(organization_custom_repository_role_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


