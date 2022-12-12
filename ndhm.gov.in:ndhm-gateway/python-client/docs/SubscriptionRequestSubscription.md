# SubscriptionRequestSubscription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[SubscriptionCategory]**](SubscriptionCategory.md) |  | 
**hips** | [**List[OrganizationRepresentation]**](OrganizationRepresentation.md) |  | [optional] 
**hiu** | [**OrganizationRepresentation**](OrganizationRepresentation.md) |  | 
**patient** | [**ConsentManagerPatientID**](ConsentManagerPatientID.md) |  | 
**period** | [**SubscriptionPeriod**](SubscriptionPeriod.md) |  | 
**purpose** | [**UsePurpose**](UsePurpose.md) |  | 

## Example

```python
from openapi_client.models.subscription_request_subscription import SubscriptionRequestSubscription

# TODO update the JSON string below
json = "{}"
# create an instance of SubscriptionRequestSubscription from a JSON string
subscription_request_subscription_instance = SubscriptionRequestSubscription.from_json(json)
# print the JSON string representation of the object
print(SubscriptionRequestSubscription.to_json())

# convert the object into a dict
subscription_request_subscription_dict = subscription_request_subscription_instance.to_dict()
# create an instance of SubscriptionRequestSubscription from a dict
subscription_request_subscription_from_dict = SubscriptionRequestSubscription.from_dict(subscription_request_subscription_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


