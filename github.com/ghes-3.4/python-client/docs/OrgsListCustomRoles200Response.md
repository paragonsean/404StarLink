# OrgsListCustomRoles200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_roles** | [**List[OrganizationCustomRepositoryRole]**](OrganizationCustomRepositoryRole.md) |  | [optional] 
**total_count** | **int** | The number of custom roles in this organization | [optional] 

## Example

```python
from openapi_client.models.orgs_list_custom_roles200_response import OrgsListCustomRoles200Response

# TODO update the JSON string below
json = "{}"
# create an instance of OrgsListCustomRoles200Response from a JSON string
orgs_list_custom_roles200_response_instance = OrgsListCustomRoles200Response.from_json(json)
# print the JSON string representation of the object
print(OrgsListCustomRoles200Response.to_json())

# convert the object into a dict
orgs_list_custom_roles200_response_dict = orgs_list_custom_roles200_response_instance.to_dict()
# create an instance of OrgsListCustomRoles200Response from a dict
orgs_list_custom_roles200_response_from_dict = OrgsListCustomRoles200Response.from_dict(orgs_list_custom_roles200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


