# MultiConditionalSplitActivity

<p>Specifies the settings for a multivariate split activity in a journey. This type of activity sends participants down one of as many as five paths (including a default <i>Else</i> path) in a journey, based on conditions that you specify.</p> <note><p>To create multivariate split activities that send participants down different paths based on push notification events (such as Open or Received events), your mobile app has to specify the User ID and Endpoint ID values. For more information, see <a href=\"https://docs.aws.amazon.com/pinpoint/latest/developerguide/integrate.html\">Integrating Amazon Pinpoint with your application</a> in the <i>Amazon Pinpoint Developer Guide</i>.</p></note>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branches** | **List** |  | [optional] 
**default_activity** | **str** |  | [optional] 
**evaluation_wait_time** | [**MultiConditionalSplitActivityEvaluationWaitTime**](MultiConditionalSplitActivityEvaluationWaitTime.md) |  | [optional] 

## Example

```python
from openapi_client.models.multi_conditional_split_activity import MultiConditionalSplitActivity

# TODO update the JSON string below
json = "{}"
# create an instance of MultiConditionalSplitActivity from a JSON string
multi_conditional_split_activity_instance = MultiConditionalSplitActivity.from_json(json)
# print the JSON string representation of the object
print(MultiConditionalSplitActivity.to_json())

# convert the object into a dict
multi_conditional_split_activity_dict = multi_conditional_split_activity_instance.to_dict()
# create an instance of MultiConditionalSplitActivity from a dict
multi_conditional_split_activity_from_dict = MultiConditionalSplitActivity.from_dict(multi_conditional_split_activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


