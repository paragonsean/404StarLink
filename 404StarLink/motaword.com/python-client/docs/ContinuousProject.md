# ContinuousProject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analytics_enabled** | **bool** | Should we collect analytics data from Active for this continuous project? | [optional] 
**auto_start_postedit** | **bool** | Immediately start post-editing project for translation requests that are applied MT. | [optional] 
**created_at** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**id** | **int** |  | [optional] 
**is_enabled** | **bool** |  | [optional] 
**last_activity_at** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**links** | [**ContinuousProjectLinks**](ContinuousProjectLinks.md) |  | [optional] 
**mt_enabled** | **bool** | Immediately apply MT on translation requests if they are missing from TM. | [optional] 
**mt_engine** | **str** | One of \&quot;MOTAWORD\&quot;, \&quot;GOOGLE\&quot;, \&quot;AMAZON\&quot;, \&quot;MS\&quot;. Default is \&quot;MOTAWORD\&quot;. | [optional] 
**name** | **str** |  | [optional] 
**postedit_enabled** | **bool** | Get an instant quote for translation requests that are applied MT. | [optional] 
**source_language** | **str** |  | [optional] 
**status** | **str** | One of \&quot;a &#x3D;&gt; ACTIVE\&quot;, \&quot;i &#x3D;&gt; INACTIVE\&quot;, \&quot;d &#x3D;&gt; DELETED\&quot;, \&quot;c &#x3D;&gt; SCHEDULED CANCELLATION\&quot;, \&quot;p &#x3D;&gt; SCHEDULED CHANGE\&quot; | [optional] 
**subscription** | [**Subscription**](Subscription.md) |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 
**type** | **str** | Continuous project type. We currently have only 2 types, NULL and \&quot;active\&quot;. | [optional] 
**word_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project import ContinuousProject

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProject from a JSON string
continuous_project_instance = ContinuousProject.from_json(json)
# print the JSON string representation of the object
print(ContinuousProject.to_json())

# convert the object into a dict
continuous_project_dict = continuous_project_instance.to_dict()
# create an instance of ContinuousProject from a dict
continuous_project_from_dict = ContinuousProject.from_dict(continuous_project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


