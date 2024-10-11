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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class ReposCreateInOrgRequest(BaseModel):
    """
    ReposCreateInOrgRequest
    """ # noqa: E501
    allow_auto_merge: Optional[StrictBool] = Field(default=False, description="Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.")
    allow_merge_commit: Optional[StrictBool] = Field(default=True, description="Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.")
    allow_rebase_merge: Optional[StrictBool] = Field(default=True, description="Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.")
    allow_squash_merge: Optional[StrictBool] = Field(default=True, description="Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.")
    auto_init: Optional[StrictBool] = Field(default=False, description="Pass `true` to create an initial commit with empty README.")
    delete_branch_on_merge: Optional[StrictBool] = Field(default=False, description="Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion. **The authenticated user must be an organization owner to set this property to `true`.**")
    description: Optional[StrictStr] = Field(default=None, description="A short description of the repository.")
    gitignore_template: Optional[StrictStr] = Field(default=None, description="Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, \"Haskell\".")
    has_downloads: Optional[StrictBool] = Field(default=True, description="Whether downloads are enabled.")
    has_issues: Optional[StrictBool] = Field(default=True, description="Either `true` to enable issues for this repository or `false` to disable them.")
    has_projects: Optional[StrictBool] = Field(default=True, description="Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.")
    has_wiki: Optional[StrictBool] = Field(default=True, description="Either `true` to enable the wiki for this repository or `false` to disable it.")
    homepage: Optional[StrictStr] = Field(default=None, description="A URL with more information about the repository.")
    is_template: Optional[StrictBool] = Field(default=False, description="Either `true` to make this repo available as a template repository or `false` to prevent it.")
    license_template: Optional[StrictStr] = Field(default=None, description="Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://docs.github.com/enterprise-server@3.4/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, \"mit\" or \"mpl-2.0\".")
    merge_commit_message: Optional[StrictStr] = Field(default=None, description="The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.")
    merge_commit_title: Optional[StrictStr] = Field(default=None, description="The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).")
    name: StrictStr = Field(description="The name of the repository.")
    private: Optional[StrictBool] = Field(default=False, description="Whether the repository is private.")
    squash_merge_commit_message: Optional[StrictStr] = Field(default=None, description="The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.")
    squash_merge_commit_title: Optional[StrictStr] = Field(default=None, description="The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).")
    team_id: Optional[StrictInt] = Field(default=None, description="The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization.")
    use_squash_pr_title_as_default: Optional[StrictBool] = Field(default=False, description="Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property has been deprecated. Please use `squash_merge_commit_title` instead.")
    visibility: Optional[StrictStr] = Field(default=None, description="The visibility of the repository. **Note**: For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise. For more information, see \"[Creating an internal repository](https://docs.github.com/enterprise-server@3.4/github/creating-cloning-and-archiving-repositories/about-repository-visibility#about-internal-repositories)\" in the GitHub Help documentation.   The `visibility` parameter overrides the `private` parameter when you use both parameters with the `nebula-preview` preview header.")
    __properties: ClassVar[List[str]] = ["allow_auto_merge", "allow_merge_commit", "allow_rebase_merge", "allow_squash_merge", "auto_init", "delete_branch_on_merge", "description", "gitignore_template", "has_downloads", "has_issues", "has_projects", "has_wiki", "homepage", "is_template", "license_template", "merge_commit_message", "merge_commit_title", "name", "private", "squash_merge_commit_message", "squash_merge_commit_title", "team_id", "use_squash_pr_title_as_default", "visibility"]

    @field_validator('merge_commit_message')
    def merge_commit_message_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['PR_BODY', 'PR_TITLE', 'BLANK']):
            raise ValueError("must be one of enum values ('PR_BODY', 'PR_TITLE', 'BLANK')")
        return value

    @field_validator('merge_commit_title')
    def merge_commit_title_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['PR_TITLE', 'MERGE_MESSAGE']):
            raise ValueError("must be one of enum values ('PR_TITLE', 'MERGE_MESSAGE')")
        return value

    @field_validator('squash_merge_commit_message')
    def squash_merge_commit_message_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['PR_BODY', 'COMMIT_MESSAGES', 'BLANK']):
            raise ValueError("must be one of enum values ('PR_BODY', 'COMMIT_MESSAGES', 'BLANK')")
        return value

    @field_validator('squash_merge_commit_title')
    def squash_merge_commit_title_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['PR_TITLE', 'COMMIT_OR_PR_TITLE']):
            raise ValueError("must be one of enum values ('PR_TITLE', 'COMMIT_OR_PR_TITLE')")
        return value

    @field_validator('visibility')
    def visibility_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['public', 'private', 'internal']):
            raise ValueError("must be one of enum values ('public', 'private', 'internal')")
        return value

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
        """Create an instance of ReposCreateInOrgRequest from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReposCreateInOrgRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "allow_auto_merge": obj.get("allow_auto_merge") if obj.get("allow_auto_merge") is not None else False,
            "allow_merge_commit": obj.get("allow_merge_commit") if obj.get("allow_merge_commit") is not None else True,
            "allow_rebase_merge": obj.get("allow_rebase_merge") if obj.get("allow_rebase_merge") is not None else True,
            "allow_squash_merge": obj.get("allow_squash_merge") if obj.get("allow_squash_merge") is not None else True,
            "auto_init": obj.get("auto_init") if obj.get("auto_init") is not None else False,
            "delete_branch_on_merge": obj.get("delete_branch_on_merge") if obj.get("delete_branch_on_merge") is not None else False,
            "description": obj.get("description"),
            "gitignore_template": obj.get("gitignore_template"),
            "has_downloads": obj.get("has_downloads") if obj.get("has_downloads") is not None else True,
            "has_issues": obj.get("has_issues") if obj.get("has_issues") is not None else True,
            "has_projects": obj.get("has_projects") if obj.get("has_projects") is not None else True,
            "has_wiki": obj.get("has_wiki") if obj.get("has_wiki") is not None else True,
            "homepage": obj.get("homepage"),
            "is_template": obj.get("is_template") if obj.get("is_template") is not None else False,
            "license_template": obj.get("license_template"),
            "merge_commit_message": obj.get("merge_commit_message"),
            "merge_commit_title": obj.get("merge_commit_title"),
            "name": obj.get("name"),
            "private": obj.get("private") if obj.get("private") is not None else False,
            "squash_merge_commit_message": obj.get("squash_merge_commit_message"),
            "squash_merge_commit_title": obj.get("squash_merge_commit_title"),
            "team_id": obj.get("team_id"),
            "use_squash_pr_title_as_default": obj.get("use_squash_pr_title_as_default") if obj.get("use_squash_pr_title_as_default") is not None else False,
            "visibility": obj.get("visibility")
        })
        return _obj


