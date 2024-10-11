# ListOfClosedDaysRulesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**start_date_time** | **str** |  | [optional] 
**end_date_time** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_of_closed_days_rules_inner import ListOfClosedDaysRulesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ListOfClosedDaysRulesInner from a JSON string
list_of_closed_days_rules_inner_instance = ListOfClosedDaysRulesInner.from_json(json)
# print the JSON string representation of the object
print(ListOfClosedDaysRulesInner.to_json())

# convert the object into a dict
list_of_closed_days_rules_inner_dict = list_of_closed_days_rules_inner_instance.to_dict()
# create an instance of ListOfClosedDaysRulesInner from a dict
list_of_closed_days_rules_inner_from_dict = ListOfClosedDaysRulesInner.from_dict(list_of_closed_days_rules_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


