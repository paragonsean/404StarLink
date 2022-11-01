# OrganizationSimple

A GitHub organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**description** | **str** |  | 
**events_url** | **str** |  | 
**hooks_url** | **str** |  | 
**id** | **int** |  | 
**issues_url** | **str** |  | 
**login** | **str** |  | 
**members_url** | **str** |  | 
**node_id** | **str** |  | 
**public_members_url** | **str** |  | 
**repos_url** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.organization_simple import OrganizationSimple

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationSimple from a JSON string
organization_simple_instance = OrganizationSimple.from_json(json)
# print the JSON string representation of the object
print(OrganizationSimple.to_json())

# convert the object into a dict
organization_simple_dict = organization_simple_instance.to_dict()
# create an instance of OrganizationSimple from a dict
organization_simple_from_dict = OrganizationSimple.from_dict(organization_simple_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


