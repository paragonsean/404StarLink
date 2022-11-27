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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.action import Action
from openapi_client.models.bool import bool
from openapi_client.models.int import int
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class MessageConfigurationADMMessage(BaseModel):
    """
    MessageConfigurationADMMessage
    """ # noqa: E501
    action: Optional[Any] = Field(default=None, alias="Action")
    body: Optional[Any] = Field(default=None, alias="Body")
    image_icon_url: Optional[Any] = Field(default=None, alias="ImageIconUrl")
    image_small_icon_url: Optional[Any] = Field(default=None, alias="ImageSmallIconUrl")
    image_url: Optional[Any] = Field(default=None, alias="ImageUrl")
    json_body: Optional[Any] = Field(default=None, alias="JsonBody")
    media_url: Optional[Any] = Field(default=None, alias="MediaUrl")
    raw_content: Optional[Any] = Field(default=None, alias="RawContent")
    silent_push: Optional[Any] = Field(default=None, alias="SilentPush")
    time_to_live: Optional[Any] = Field(default=None, alias="TimeToLive")
    title: Optional[Any] = Field(default=None, alias="Title")
    url: Optional[Any] = Field(default=None, alias="Url")
    __properties: ClassVar[List[str]] = ["Action", "Body", "ImageIconUrl", "ImageSmallIconUrl", "ImageUrl", "JsonBody", "MediaUrl", "RawContent", "SilentPush", "TimeToLive", "Title", "Url"]

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
        """Create an instance of MessageConfigurationADMMessage from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of action
        if self.action:
            _dict['Action'] = self.action.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of MessageConfigurationADMMessage from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Action": Action.from_dict(obj["Action"]) if obj.get("Action") is not None else None,
            "Body": obj.get("Body"),
            "ImageIconUrl": obj.get("ImageIconUrl"),
            "ImageSmallIconUrl": obj.get("ImageSmallIconUrl"),
            "ImageUrl": obj.get("ImageUrl"),
            "JsonBody": obj.get("JsonBody"),
            "MediaUrl": obj.get("MediaUrl"),
            "RawContent": obj.get("RawContent"),
            "SilentPush": obj.get("SilentPush"),
            "TimeToLive": obj.get("TimeToLive"),
            "Title": obj.get("Title"),
            "Url": obj.get("Url")
        })
        return _obj


