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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.ldap_mapping_user_plan import LdapMappingUserPlan
from typing import Optional, Set
from typing_extensions import Self

class LdapMappingUser(BaseModel):
    """
    Ldap Private User
    """ # noqa: E501
    avatar_url: StrictStr
    bio: Optional[StrictStr]
    blog: Optional[StrictStr]
    business_plus: Optional[StrictBool] = None
    collaborators: StrictInt
    company: Optional[StrictStr]
    created_at: datetime
    disk_usage: StrictInt
    email: Optional[StrictStr]
    events_url: StrictStr
    followers: StrictInt
    followers_url: StrictStr
    following: StrictInt
    following_url: StrictStr
    gists_url: StrictStr
    gravatar_id: Optional[StrictStr]
    hireable: Optional[StrictBool]
    html_url: StrictStr
    id: StrictInt
    ldap_dn: Optional[StrictStr] = None
    location: Optional[StrictStr]
    login: StrictStr
    name: Optional[StrictStr]
    node_id: StrictStr
    organizations_url: StrictStr
    owned_private_repos: StrictInt
    plan: Optional[LdapMappingUserPlan] = None
    private_gists: StrictInt
    public_gists: StrictInt
    public_repos: StrictInt
    received_events_url: StrictStr
    repos_url: StrictStr
    site_admin: StrictBool
    starred_url: StrictStr
    subscriptions_url: StrictStr
    suspended_at: Optional[datetime] = None
    total_private_repos: StrictInt
    twitter_username: Optional[StrictStr] = None
    two_factor_authentication: StrictBool
    type: StrictStr
    updated_at: datetime
    url: StrictStr
    __properties: ClassVar[List[str]] = ["avatar_url", "bio", "blog", "business_plus", "collaborators", "company", "created_at", "disk_usage", "email", "events_url", "followers", "followers_url", "following", "following_url", "gists_url", "gravatar_id", "hireable", "html_url", "id", "ldap_dn", "location", "login", "name", "node_id", "organizations_url", "owned_private_repos", "plan", "private_gists", "public_gists", "public_repos", "received_events_url", "repos_url", "site_admin", "starred_url", "subscriptions_url", "suspended_at", "total_private_repos", "twitter_username", "two_factor_authentication", "type", "updated_at", "url"]

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
        """Create an instance of LdapMappingUser from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of plan
        if self.plan:
            _dict['plan'] = self.plan.to_dict()
        # set to None if bio (nullable) is None
        # and model_fields_set contains the field
        if self.bio is None and "bio" in self.model_fields_set:
            _dict['bio'] = None

        # set to None if blog (nullable) is None
        # and model_fields_set contains the field
        if self.blog is None and "blog" in self.model_fields_set:
            _dict['blog'] = None

        # set to None if company (nullable) is None
        # and model_fields_set contains the field
        if self.company is None and "company" in self.model_fields_set:
            _dict['company'] = None

        # set to None if email (nullable) is None
        # and model_fields_set contains the field
        if self.email is None and "email" in self.model_fields_set:
            _dict['email'] = None

        # set to None if gravatar_id (nullable) is None
        # and model_fields_set contains the field
        if self.gravatar_id is None and "gravatar_id" in self.model_fields_set:
            _dict['gravatar_id'] = None

        # set to None if hireable (nullable) is None
        # and model_fields_set contains the field
        if self.hireable is None and "hireable" in self.model_fields_set:
            _dict['hireable'] = None

        # set to None if location (nullable) is None
        # and model_fields_set contains the field
        if self.location is None and "location" in self.model_fields_set:
            _dict['location'] = None

        # set to None if name (nullable) is None
        # and model_fields_set contains the field
        if self.name is None and "name" in self.model_fields_set:
            _dict['name'] = None

        # set to None if suspended_at (nullable) is None
        # and model_fields_set contains the field
        if self.suspended_at is None and "suspended_at" in self.model_fields_set:
            _dict['suspended_at'] = None

        # set to None if twitter_username (nullable) is None
        # and model_fields_set contains the field
        if self.twitter_username is None and "twitter_username" in self.model_fields_set:
            _dict['twitter_username'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of LdapMappingUser from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "avatar_url": obj.get("avatar_url"),
            "bio": obj.get("bio"),
            "blog": obj.get("blog"),
            "business_plus": obj.get("business_plus"),
            "collaborators": obj.get("collaborators"),
            "company": obj.get("company"),
            "created_at": obj.get("created_at"),
            "disk_usage": obj.get("disk_usage"),
            "email": obj.get("email"),
            "events_url": obj.get("events_url"),
            "followers": obj.get("followers"),
            "followers_url": obj.get("followers_url"),
            "following": obj.get("following"),
            "following_url": obj.get("following_url"),
            "gists_url": obj.get("gists_url"),
            "gravatar_id": obj.get("gravatar_id"),
            "hireable": obj.get("hireable"),
            "html_url": obj.get("html_url"),
            "id": obj.get("id"),
            "ldap_dn": obj.get("ldap_dn"),
            "location": obj.get("location"),
            "login": obj.get("login"),
            "name": obj.get("name"),
            "node_id": obj.get("node_id"),
            "organizations_url": obj.get("organizations_url"),
            "owned_private_repos": obj.get("owned_private_repos"),
            "plan": LdapMappingUserPlan.from_dict(obj["plan"]) if obj.get("plan") is not None else None,
            "private_gists": obj.get("private_gists"),
            "public_gists": obj.get("public_gists"),
            "public_repos": obj.get("public_repos"),
            "received_events_url": obj.get("received_events_url"),
            "repos_url": obj.get("repos_url"),
            "site_admin": obj.get("site_admin"),
            "starred_url": obj.get("starred_url"),
            "subscriptions_url": obj.get("subscriptions_url"),
            "suspended_at": obj.get("suspended_at"),
            "total_private_repos": obj.get("total_private_repos"),
            "twitter_username": obj.get("twitter_username"),
            "two_factor_authentication": obj.get("two_factor_authentication"),
            "type": obj.get("type"),
            "updated_at": obj.get("updated_at"),
            "url": obj.get("url")
        })
        return _obj


