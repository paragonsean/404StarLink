# ConditionalSplitActivity

<p>Specifies the settings for a yes/no split activity in a journey. This type of activity sends participants down one of two paths in a journey, based on conditions that you specify.</p> <note><p>To create yes/no split activities that send participants down different paths based on push notification events (such as Open or Received events), your mobile app has to specify the User ID and Endpoint ID values. For more information, see <a href=\"https://docs.aws.amazon.com/pinpoint/latest/developerguide/integrate.html\">Integrating Amazon Pinpoint with your application</a> in the <i>Amazon Pinpoint Developer Guide</i>.</p></note>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | [**ConditionalSplitActivityCondition**](ConditionalSplitActivityCondition.md) |  | [optional] 
**evaluation_wait_time** | [**ConditionalSplitActivityEvaluationWaitTime**](ConditionalSplitActivityEvaluationWaitTime.md) |  | [optional] 
**false_activity** | **str** |  | [optional] 
**true_activity** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.conditional_split_activity import ConditionalSplitActivity

# TODO update the JSON string below
json = "{}"
# create an instance of ConditionalSplitActivity from a JSON string
conditional_split_activity_instance = ConditionalSplitActivity.from_json(json)
# print the JSON string representation of the object
print(ConditionalSplitActivity.to_json())

# convert the object into a dict
conditional_split_activity_dict = conditional_split_activity_instance.to_dict()
# create an instance of ConditionalSplitActivity from a dict
conditional_split_activity_from_dict = ConditionalSplitActivity.from_dict(conditional_split_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


