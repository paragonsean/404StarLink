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
from openapi_client.models.in_app_message_button_android import InAppMessageButtonAndroid
from openapi_client.models.in_app_message_button_default_config import InAppMessageButtonDefaultConfig
from typing import Optional, Set
from typing_extensions import Self

class InAppMessageButton(BaseModel):
    """
    Button Config for an in-app message.
    """ # noqa: E501
    android: Optional[InAppMessageButtonAndroid] = Field(default=None, alias="Android")
    default_config: Optional[InAppMessageButtonDefaultConfig] = Field(default=None, alias="DefaultConfig")
    ios: Optional[InAppMessageButtonAndroid] = Field(default=None, alias="IOS")
    web: Optional[InAppMessageButtonAndroid] = Field(default=None, alias="Web")
    __properties: ClassVar[List[str]] = ["Android", "DefaultConfig", "IOS", "Web"]

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
        """Create an instance of InAppMessageButton from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of android
        if self.android:
            _dict['Android'] = self.android.to_dict()
        # override the default output from pydantic by calling `to_dict()` of default_config
        if self.default_config:
            _dict['DefaultConfig'] = self.default_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ios
        if self.ios:
            _dict['IOS'] = self.ios.to_dict()
        # override the default output from pydantic by calling `to_dict()` of web
        if self.web:
            _dict['Web'] = self.web.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of InAppMessageButton from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Android": InAppMessageButtonAndroid.from_dict(obj["Android"]) if obj.get("Android") is not None else None,
            "DefaultConfig": InAppMessageButtonDefaultConfig.from_dict(obj["DefaultConfig"]) if obj.get("DefaultConfig") is not None else None,
            "IOS": InAppMessageButtonAndroid.from_dict(obj["IOS"]) if obj.get("IOS") is not None else None,
            "Web": InAppMessageButtonAndroid.from_dict(obj["Web"]) if obj.get("Web") is not None else None
        })
        return _obj


