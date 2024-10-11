# DependabotListOrgSecrets200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secrets** | [**List[OrganizationDependabotSecret]**](OrganizationDependabotSecret.md) |  | 
**total_count** | **int** |  | 

## Example

```python
from openapi_client.models.dependabot_list_org_secrets200_response import DependabotListOrgSecrets200Response

# TODO update the JSON string below
json = "{}"
# create an instance of DependabotListOrgSecrets200Response from a JSON string
dependabot_list_org_secrets200_response_instance = DependabotListOrgSecrets200Response.from_json(json)
# print the JSON string representation of the object
print(DependabotListOrgSecrets200Response.to_json())

# convert the object into a dict
dependabot_list_org_secrets200_response_dict = dependabot_list_org_secrets200_response_instance.to_dict()
# create an instance of DependabotListOrgSecrets200Response from a dict
dependabot_list_org_secrets200_response_from_dict = DependabotListOrgSecrets200Response.from_dict(dependabot_list_org_secrets200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


