# EntityChanges


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changes** | **List[str]** |  | [optional] 
**newly_created** | **bool** |  | [optional] [default to False]

## Example

```python
from openapi_client.models.entity_changes import EntityChanges

# TODO update the JSON string below
json = "{}"
# create an instance of EntityChanges from a JSON string
entity_changes_instance = EntityChanges.from_json(json)
# print the JSON string representation of the object
print(EntityChanges.to_json())

# convert the object into a dict
entity_changes_dict = entity_changes_instance.to_dict()
# create an instance of EntityChanges from a dict
entity_changes_from_dict = EntityChanges.from_dict(entity_changes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


