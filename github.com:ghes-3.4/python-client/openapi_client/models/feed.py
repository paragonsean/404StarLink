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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.feed_links import FeedLinks
from openapi_client.models.link_with_type import LinkWithType
from typing import Optional, Set
from typing_extensions import Self

class Feed(BaseModel):
    """
    Feed
    """ # noqa: E501
    links: FeedLinks = Field(alias="_links")
    current_user_actor_url: Optional[StrictStr] = None
    current_user_organization_url: Optional[StrictStr] = None
    current_user_organization_urls: Optional[List[StrictStr]] = None
    current_user_public_url: Optional[StrictStr] = None
    current_user_url: Optional[StrictStr] = None
    repository_discussions: Optional[LinkWithType] = None
    repository_discussions_category: Optional[LinkWithType] = None
    repository_discussions_category_url: Optional[StrictStr] = Field(default=None, description="A feed of discussions for a given repository and category.")
    repository_discussions_url: Optional[StrictStr] = Field(default=None, description="A feed of discussions for a given repository.")
    security_advisories_url: Optional[StrictStr] = None
    timeline_url: StrictStr
    user_url: StrictStr
    __properties: ClassVar[List[str]] = ["_links", "current_user_actor_url", "current_user_organization_url", "current_user_organization_urls", "current_user_public_url", "current_user_url", "repository_discussions", "repository_discussions_category", "repository_discussions_category_url", "repository_discussions_url", "security_advisories_url", "timeline_url", "user_url"]

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
        """Create an instance of Feed from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of links
        if self.links:
            _dict['_links'] = self.links.to_dict()
        # override the default output from pydantic by calling `to_dict()` of repository_discussions
        if self.repository_discussions:
            _dict['repository_discussions'] = self.repository_discussions.to_dict()
        # override the default output from pydantic by calling `to_dict()` of repository_discussions_category
        if self.repository_discussions_category:
            _dict['repository_discussions_category'] = self.repository_discussions_category.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Feed from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "_links": FeedLinks.from_dict(obj["_links"]) if obj.get("_links") is not None else None,
            "current_user_actor_url": obj.get("current_user_actor_url"),
            "current_user_organization_url": obj.get("current_user_organization_url"),
            "current_user_organization_urls": obj.get("current_user_organization_urls"),
            "current_user_public_url": obj.get("current_user_public_url"),
            "current_user_url": obj.get("current_user_url"),
            "repository_discussions": LinkWithType.from_dict(obj["repository_discussions"]) if obj.get("repository_discussions") is not None else None,
            "repository_discussions_category": LinkWithType.from_dict(obj["repository_discussions_category"]) if obj.get("repository_discussions_category") is not None else None,
            "repository_discussions_category_url": obj.get("repository_discussions_category_url"),
            "repository_discussions_url": obj.get("repository_discussions_url"),
            "security_advisories_url": obj.get("security_advisories_url"),
            "timeline_url": obj.get("timeline_url"),
            "user_url": obj.get("user_url")
        })
        return _obj


