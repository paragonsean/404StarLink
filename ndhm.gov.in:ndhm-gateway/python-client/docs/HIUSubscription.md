# HIUSubscription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hiu** | [**OrganizationRepresentation**](OrganizationRepresentation.md) |  | 
**id** | **str** |  | 
**patient** | [**ConsentManagerPatientID**](ConsentManagerPatientID.md) |  | 
**sources** | [**List[HIUSubscriptionContext]**](HIUSubscriptionContext.md) |  | 

## Example

```python
from openapi_client.models.hiu_subscription import HIUSubscription

# TODO update the JSON string below
json = "{}"
# create an instance of HIUSubscription from a JSON string
hiu_subscription_instance = HIUSubscription.from_json(json)
# print the JSON string representation of the object
print(HIUSubscription.to_json())

# convert the object into a dict
hiu_subscription_dict = hiu_subscription_instance.to_dict()
# create an instance of HIUSubscription from a dict
hiu_subscription_from_dict = HIUSubscription.from_dict(hiu_subscription_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


