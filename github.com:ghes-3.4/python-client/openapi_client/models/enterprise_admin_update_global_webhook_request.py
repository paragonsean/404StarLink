# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.enterprise_admin_create_global_webhook_request_config import EnterpriseAdminCreateGlobalWebhookRequestConfig
from typing import Optional, Set
from typing_extensions import Self

class EnterpriseAdminUpdateGlobalWebhookRequest(BaseModel):
    """
    EnterpriseAdminUpdateGlobalWebhookRequest
    """ # noqa: E501
    active: Optional[StrictBool] = Field(default=True, description="Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.")
    config: Optional[EnterpriseAdminCreateGlobalWebhookRequestConfig] = None
    events: Optional[List[StrictStr]] = Field(default=None, description="The [events](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads) that trigger this webhook. A global webhook can be triggered by `user` and `organization` events. Default: `user` and `organization`.")
    __properties: ClassVar[List[str]] = ["active", "config", "events"]

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
        """Create an instance of EnterpriseAdminUpdateGlobalWebhookRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of config
        if self.config:
            _dict['config'] = self.config.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of EnterpriseAdminUpdateGlobalWebhookRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "active": obj.get("active") if obj.get("active") is not None else True,
            "config": EnterpriseAdminCreateGlobalWebhookRequestConfig.from_dict(obj["config"]) if obj.get("config") is not None else None,
            "events": obj.get("events")
        })
        return _obj


