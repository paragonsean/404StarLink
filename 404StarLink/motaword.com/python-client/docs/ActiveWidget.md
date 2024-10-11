# ActiveWidget


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_hash_in_url** | **bool** | When true, hash params are included in filenames. When false, params are ignored. | [optional] 
**allow_query_in_url** | **bool** | When true, query params are included in filenames. When false, params are ignored. | [optional] 
**auto_detect_source_language** | **bool** | When true, we will ignore the source language of your project and try to automatically detect the source language of the given content. This is especially useful in environments with unpredictable source contents, such as a chat environment. | [optional] 
**created_at** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**elements** | **str** | Continuous project exclusive elements and rules | [optional] 
**follow_user** | **bool** | Specify whether we should follow the user around in your website and automatically translate pages. | [optional] 
**force_cache_refresh_interval** | **bool** | Determines whether to force-refresh local browser cache of your translations in certain period of times, no matter if there is a new activity in the project. | [optional] 
**id** | **int** |  | [optional] 
**language_mappings** | **str** | Continuous project language mappings | [optional] 
**live** | **bool** | Whether ActiveJS should be considered live in an embedded site. Use &#x60;false&#x60; if you are still testing Active. Go to your Active dashboard and follow links to your website to actually test Active. | [optional] 
**modify_links** | **bool** | We can automatically localize the same-domain URLs in your page. The way we localize the URL depends on urlMode configuration. We can either add/update the locale query parameter, or add/update the path of the URL. | [optional] 
**name** | **str** |  | [optional] 
**optimize_per_page** | **bool** | When true, Active ecosystem will optimize the script and data flows per page, rather than per project. This decreases the bandwidth usage per script, but makes translation publishing more complex and script serving per-page. | [optional] 
**pages** | **str** | Continuous project page rules | [optional] 
**path_regex** | **str** | Custom regex for path-type URL mode. | [optional] 
**position** | **str** | Options are \&quot;bottom-left\&quot;, \&quot;bottom-right\&quot;, \&quot;in-place\&quot; | [optional] 
**query_name** | **str** | Query parameter name to be used with query-type URL mode. Default is &#39;locale&#39;. | [optional] [default to 'locale']
**reboot_on_url_change** | **bool** | When true, Active ecosystem reboots itself when url changes. | [optional] 
**restricted_domains** | **str** | JSON string for a list of domains that this widget&#39;s API interactions are limited to. | [optional] 
**sections** | **str** | Continuous project section rules | [optional] 
**test_mode** | **bool** | Is the Active Widget in test mode? This changes a couple behaviors in the widget to make it easier for you to test and develop your Active integration. | [optional] 
**theme** | **str** | \\\&quot;light\\\&quot;, \\\&quot;dark\\\&quot; OR custom JSON. | [optional] 
**token** | **str** | Token that you should use when you are using this widget on your website. | [optional] 
**url_change_mode** | **str** | When a user changes locale (or when we automatically detect and change it for them), we will change the URL of the page they are in. We can do this by actually redirecting the user to the new page, or by simply changing the URL in the address bar via browser&#39;s History API. When NULL, we won&#39;t apply any URL changes. | [optional] 
**url_mode** | **str** | When a user changes locale (or when we automatically detect and change it for them), we will change the URL of the page they are in. We can either change the path of the URL to prefix it with the locale code, or we can add a query parameter to the URL. We also use this mode to detect the locale for the current page when a user directly loads a page. When NULL, locale detection from URL will be disabled (even then, if the user has selected a locale manually, and followUser is enabled, we will still automatically translate the page in user&#39;s locale. | [optional] 
**use_cache** | **bool** | Should we make use of local browser cache for your visitors? We will refresh the cache when Active JS detects new activity in your project. | [optional] 
**use_dummy_translations** | **bool** | When enabled, we will translate your website with dummy content, rather than actually using MT/TM. | [optional] 
**variables** | **str** | Continuous project variable definitions | [optional] 

## Example

```python
from openapi_client.models.active_widget import ActiveWidget

# TODO update the JSON string below
json = "{}"
# create an instance of ActiveWidget from a JSON string
active_widget_instance = ActiveWidget.from_json(json)
# print the JSON string representation of the object
print(ActiveWidget.to_json())

# convert the object into a dict
active_widget_dict = active_widget_instance.to_dict()
# create an instance of ActiveWidget from a dict
active_widget_from_dict = ActiveWidget.from_dict(active_widget_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


