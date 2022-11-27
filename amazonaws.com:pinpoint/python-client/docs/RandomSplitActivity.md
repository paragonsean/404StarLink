# RandomSplitActivity

Specifies the settings for a random split activity in a journey. This type of activity randomly sends specified percentages of participants down one of as many as five paths in a journey, based on conditions that you specify.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branches** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.random_split_activity import RandomSplitActivity

# TODO update the JSON string below
json = "{}"
# create an instance of RandomSplitActivity from a JSON string
random_split_activity_instance = RandomSplitActivity.from_json(json)
# print the JSON string representation of the object
print(RandomSplitActivity.to_json())

# convert the object into a dict
random_split_activity_dict = random_split_activity_instance.to_dict()
# create an instance of RandomSplitActivity from a dict
random_split_activity_from_dict = RandomSplitActivity.from_dict(random_split_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


