# Activity

Specifies the configuration and other settings for an activity in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom** | [**ActivityCUSTOM**](ActivityCUSTOM.md) |  | [optional] 
**conditional_split** | [**ActivityConditionalSplit**](ActivityConditionalSplit.md) |  | [optional] 
**description** | **str** |  | [optional] 
**email** | [**ActivityEMAIL**](ActivityEMAIL.md) |  | [optional] 
**holdout** | [**ActivityHoldout**](ActivityHoldout.md) |  | [optional] 
**multi_condition** | [**ActivityMultiCondition**](ActivityMultiCondition.md) |  | [optional] 
**push** | [**ActivityPUSH**](ActivityPUSH.md) |  | [optional] 
**random_split** | [**ActivityRandomSplit**](ActivityRandomSplit.md) |  | [optional] 
**sms** | [**ActivitySMS**](ActivitySMS.md) |  | [optional] 
**wait** | [**ActivityWait**](ActivityWait.md) |  | [optional] 
**contact_center** | [**ActivityContactCenter**](ActivityContactCenter.md) |  | [optional] 

## Example

```python
from openapi_client.models.activity import Activity

# TODO update the JSON string below
json = "{}"
# create an instance of Activity from a JSON string
activity_instance = Activity.from_json(json)
# print the JSON string representation of the object
print(Activity.to_json())

# convert the object into a dict
activity_dict = activity_instance.to_dict()
# create an instance of Activity from a dict
activity_from_dict = Activity.from_dict(activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


