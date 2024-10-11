# SubscriptionApprovalNotificationNotification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**SubscriptionStatus**](SubscriptionStatus.md) |  | 
**subscription** | [**HIUSubscription**](HIUSubscription.md) |  | [optional] 
**subscription_request_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.subscription_approval_notification_notification import SubscriptionApprovalNotificationNotification

# TODO update the JSON string below
json = "{}"
# create an instance of SubscriptionApprovalNotificationNotification from a JSON string
subscription_approval_notification_notification_instance = SubscriptionApprovalNotificationNotification.from_json(json)
# print the JSON string representation of the object
print(SubscriptionApprovalNotificationNotification.to_json())

# convert the object into a dict
subscription_approval_notification_notification_dict = subscription_approval_notification_notification_instance.to_dict()
# create an instance of SubscriptionApprovalNotificationNotification from a dict
subscription_approval_notification_notification_from_dict = SubscriptionApprovalNotificationNotification.from_dict(subscription_approval_notification_notification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


