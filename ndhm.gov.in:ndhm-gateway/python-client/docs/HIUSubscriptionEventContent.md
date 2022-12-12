# HIUSubscriptionEventContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**List[EventCategoryDetail]**](EventCategoryDetail.md) |  | 
**hip** | [**OrganizationRepresentation**](OrganizationRepresentation.md) |  | 
**patient** | [**ConsentManagerPatientID**](ConsentManagerPatientID.md) |  | 

## Example

```python
from openapi_client.models.hiu_subscription_event_content import HIUSubscriptionEventContent

# TODO update the JSON string below
json = "{}"
# create an instance of HIUSubscriptionEventContent from a JSON string
hiu_subscription_event_content_instance = HIUSubscriptionEventContent.from_json(json)
# print the JSON string representation of the object
print(HIUSubscriptionEventContent.to_json())

# convert the object into a dict
hiu_subscription_event_content_dict = hiu_subscription_event_content_instance.to_dict()
# create an instance of HIUSubscriptionEventContent from a dict
hiu_subscription_event_content_from_dict = HIUSubscriptionEventContent.from_dict(hiu_subscription_event_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


