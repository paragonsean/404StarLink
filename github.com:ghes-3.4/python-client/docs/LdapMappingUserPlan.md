# LdapMappingUserPlan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collaborators** | **int** |  | 
**name** | **str** |  | 
**private_repos** | **int** |  | 
**space** | **int** |  | 

## Example

```python
from openapi_client.models.ldap_mapping_user_plan import LdapMappingUserPlan

# TODO update the JSON string below
json = "{}"
# create an instance of LdapMappingUserPlan from a JSON string
ldap_mapping_user_plan_instance = LdapMappingUserPlan.from_json(json)
# print the JSON string representation of the object
print(LdapMappingUserPlan.to_json())

# convert the object into a dict
ldap_mapping_user_plan_dict = ldap_mapping_user_plan_instance.to_dict()
# create an instance of LdapMappingUserPlan from a dict
ldap_mapping_user_plan_from_dict = LdapMappingUserPlan.from_dict(ldap_mapping_user_plan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


