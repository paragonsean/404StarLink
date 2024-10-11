# RandomSplitEntry

Specifies the settings for a path in a random split activity in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_activity** | **str** |  | [optional] 
**percentage** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.random_split_entry import RandomSplitEntry

# TODO update the JSON string below
json = "{}"
# create an instance of RandomSplitEntry from a JSON string
random_split_entry_instance = RandomSplitEntry.from_json(json)
# print the JSON string representation of the object
print(RandomSplitEntry.to_json())

# convert the object into a dict
random_split_entry_dict = random_split_entry_instance.to_dict()
# create an instance of RandomSplitEntry from a dict
random_split_entry_from_dict = RandomSplitEntry.from_dict(random_split_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


