# Subscription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downgrade** | **List[str]** | Stripe downgradable plan | [optional] 
**payment_method** | **int** | Stripe subscription plan payment card internal id | [optional] 
**period_end** | **datetime** | Stripe plan period end | [optional] 
**plan_id** | **str** | Stripe subscription plan id | [optional] 
**plan_name** | **str** | Stripe subscription plan name | [optional] 
**price** | **str** | Stripe plan price | [optional] 
**products** | **List[object]** |  | [optional] 
**schedule_name** | **str** | Stripe Scheduled plan period end | [optional] 
**schedule_start** | **datetime** | Stripe Scheduled start date | [optional] 
**subscription_id** | **str** | Stripe subscription id for this project | [optional] 
**upgrade** | **List[str]** | Stripe upgradable plan | [optional] 
**with_trial** | **object** | Stripe plan trial | [optional] 

## Example

```python
from openapi_client.models.subscription import Subscription

# TODO update the JSON string below
json = "{}"
# create an instance of Subscription from a JSON string
subscription_instance = Subscription.from_json(json)
# print the JSON string representation of the object
print(Subscription.to_json())

# convert the object into a dict
subscription_dict = subscription_instance.to_dict()
# create an instance of Subscription from a dict
subscription_from_dict = Subscription.from_dict(subscription_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


