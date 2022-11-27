# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.update_application_settings_request_write_application_settings_request_campaign_hook import UpdateApplicationSettingsRequestWriteApplicationSettingsRequestCampaignHook
from openapi_client.models.update_application_settings_request_write_application_settings_request_limits import UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits
from openapi_client.models.update_application_settings_request_write_application_settings_request_quiet_time import UpdateApplicationSettingsRequestWriteApplicationSettingsRequestQuietTime
from typing import Optional, Set
from typing_extensions import Self

class UpdateApplicationSettingsRequestWriteApplicationSettingsRequest(BaseModel):
    """
    Specifies the default settings for an application.
    """ # noqa: E501
    campaign_hook: Optional[UpdateApplicationSettingsRequestWriteApplicationSettingsRequestCampaignHook] = Field(default=None, alias="CampaignHook")
    cloud_watch_metrics_enabled: Optional[Any] = Field(default=None, alias="CloudWatchMetricsEnabled")
    event_tagging_enabled: Optional[StrictBool] = Field(default=None, alias="EventTaggingEnabled")
    limits: Optional[UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits] = Field(default=None, alias="Limits")
    quiet_time: Optional[UpdateApplicationSettingsRequestWriteApplicationSettingsRequestQuietTime] = Field(default=None, alias="QuietTime")
    __properties: ClassVar[List[str]] = ["CampaignHook", "CloudWatchMetricsEnabled", "EventTaggingEnabled", "Limits", "QuietTime"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of UpdateApplicationSettingsRequestWriteApplicationSettingsRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of campaign_hook
        if self.campaign_hook:
            _dict['CampaignHook'] = self.campaign_hook.to_dict()
        # override the default output from pydantic by calling `to_dict()` of limits
        if self.limits:
            _dict['Limits'] = self.limits.to_dict()
        # override the default output from pydantic by calling `to_dict()` of quiet_time
        if self.quiet_time:
            _dict['QuietTime'] = self.quiet_time.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UpdateApplicationSettingsRequestWriteApplicationSettingsRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "CampaignHook": UpdateApplicationSettingsRequestWriteApplicationSettingsRequestCampaignHook.from_dict(obj["CampaignHook"]) if obj.get("CampaignHook") is not None else None,
            "CloudWatchMetricsEnabled": obj.get("CloudWatchMetricsEnabled"),
            "EventTaggingEnabled": obj.get("EventTaggingEnabled"),
            "Limits": UpdateApplicationSettingsRequestWriteApplicationSettingsRequestLimits.from_dict(obj["Limits"]) if obj.get("Limits") is not None else None,
            "QuietTime": UpdateApplicationSettingsRequestWriteApplicationSettingsRequestQuietTime.from_dict(obj["QuietTime"]) if obj.get("QuietTime") is not None else None
        })
        return _obj


