import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listDetail(query) {
  return request({
    url: '/system/detail/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getDetail(antiDetailId) {
  return request({
    url: '/system/detail/' + antiDetailId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addDetail(data) {
  return request({
    url: '/system/detail',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateDetail(data) {
  return request({
    url: '/system/detail',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delDetail(antiDetailId) {
  return request({
    url: '/system/detail/' + antiDetailId,
    method: 'delete'
  })
}
