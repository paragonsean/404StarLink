# ConditionalSplitActivityCondition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | **List** |  | [optional] 
**operator** | [**Operator**](Operator.md) |  | [optional] 

## Example

```python
from openapi_client.models.conditional_split_activity_condition import ConditionalSplitActivityCondition

# TODO update the JSON string below
json = "{}"
# create an instance of ConditionalSplitActivityCondition from a JSON string
conditional_split_activity_condition_instance = ConditionalSplitActivityCondition.from_json(json)
# print the JSON string representation of the object
print(ConditionalSplitActivityCondition.to_json())

# convert the object into a dict
conditional_split_activity_condition_dict = conditional_split_activity_condition_instance.to_dict()
# create an instance of ConditionalSplitActivityCondition from a dict
conditional_split_activity_condition_from_dict = ConditionalSplitActivityCondition.from_dict(conditional_split_activity_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


