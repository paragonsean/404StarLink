# Migration

A migration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archive_url** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**exclude** | **List[object]** |  | [optional] 
**exclude_attachments** | **bool** |  | 
**exclude_git_data** | **bool** |  | 
**exclude_metadata** | **bool** |  | 
**exclude_owner_projects** | **bool** |  | 
**exclude_releases** | **bool** |  | 
**guid** | **str** |  | 
**id** | **int** |  | 
**lock_repositories** | **bool** |  | 
**node_id** | **str** |  | 
**org_metadata_only** | **bool** |  | 
**owner** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**repositories** | [**List[Repository]**](Repository.md) | The repositories included in the migration. Only returned for export migrations. | 
**state** | **str** |  | 
**updated_at** | **datetime** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.migration import Migration

# TODO update the JSON string below
json = "{}"
# create an instance of Migration from a JSON string
migration_instance = Migration.from_json(json)
# print the JSON string representation of the object
print(Migration.to_json())

# convert the object into a dict
migration_dict = migration_instance.to_dict()
# create an instance of Migration from a dict
migration_from_dict = Migration.from_dict(migration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


